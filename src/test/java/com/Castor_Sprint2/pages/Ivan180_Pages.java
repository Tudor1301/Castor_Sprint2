package com.Castor_Sprint2.pages;

import com.Castor_Sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ivan180_Pages {
   public Ivan180_Pages(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

   @FindBy (xpath ="//*[text()='Learn how to use this space']" )
    public WebElement button_HowToUsePinbar;

    @FindBy (xpath ="//h3[text()='How To Use Pinbar']" )
    public WebElement message_HowToUsePinbar;

    @FindBy (xpath ="//p[1]" )
    public WebElement message_Help;

    @FindBy (xpath ="//img" )
    public WebElement image1;


}
