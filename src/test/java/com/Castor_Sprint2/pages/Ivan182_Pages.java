package com.Castor_Sprint2.pages;

import com.Castor_Sprint2.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Ivan182_Pages {
   public Ivan182_Pages(){
       PageFactory.initElements(Driver.getDriver(),this);
   }

  // @FindBy (xpath = "(//span[@class='title title-level-1'])[1]")
  @FindBy (xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement button_Fleet;

    @FindBy (xpath = "//span[text()='Vehicles Model']")
    public WebElement button_VehicleModel;

    @FindBy (xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement error_Message;

    @FindBy (xpath = "(//span[@class='grid-header-cell__label'])[1]")
    public WebElement modelName;

    @FindBy (xpath = "(//span[@class='grid-header-cell__label'])[2]")
    public WebElement make;

    @FindBy (xpath = "(//span[@class='grid-header-cell__label'])[3]")
    public WebElement canBeRequested;

    @FindBy (xpath = "(//span[@class='grid-header-cell__label'])[4]")
    public WebElement cVVI;

    @FindBy (xpath = "(//span[@class='grid-header-cell__label'])[5]")
    public WebElement cO2_FEE_MONTH;

    @FindBy (xpath = "(//span[@class='grid-header-cell__label'])[6]")
    public WebElement cost_DEPRECIATED;

    @FindBy (xpath = "(//span[@class='grid-header-cell__label'])[7]")
    public WebElement total_COST_DEPRECIATED;

    @FindBy (xpath = "(//span[@class='grid-header-cell__label'])[8]")
    public WebElement co2_EMISSIONS;

    @FindBy (xpath = "(//span[@class='grid-header-cell__label'])[9]")
    public WebElement fuel_TYPE;

    @FindBy (xpath = "(//span[@class='grid-header-cell__label'])[10]")
    public WebElement vendors;






}
