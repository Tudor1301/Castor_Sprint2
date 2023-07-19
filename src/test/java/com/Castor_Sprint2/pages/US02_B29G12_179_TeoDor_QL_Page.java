package com.Castor_Sprint2.pages;

import com.Castor_Sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_B29G12_179_TeoDor_QL_Page {
    public US02_B29G12_179_TeoDor_QL_Page(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//a[@class='help no-hash']")
    public WebElement qsign;
}
