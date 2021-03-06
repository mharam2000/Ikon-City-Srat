package com.ikonsoft.mbeans;

import com.ikonsoft.model.User;
import com.ikonsoft.services.UserService;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class RegisterView  {

    private User user=new User();
    private List<String> questions;
    private List<String> answers;
   
        
    public List<String> getQuestions() {
        return questions;
    }

    /**
     * @param questions the questions to set
     */
    public void setQuestions(List<String> questions) {
        this.questions = questions;
    }

    /**
     * @return the answers
     */
    public List<String> getAnswers() {
        return answers;
    }

    /**
     * @param answers the answers to set
     */
    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public void setUser(User user) {
        this.user = user;
    }

    /**
     * @return the user
     */
    public User getUser() {
               
              return user;
    }
public String saveUser(){
    UserService userService= new UserService();
   int userId= userService.createUser(user);
   if (userId>0) return "RegDone";
   return null;
}
}
