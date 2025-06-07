package tasks;

import java.util.HashMap;
import java.util.Map;

public class Task742 {
    public static void main(String[] args) {
        String str = "akshaychakale";

        getCountOfChars(str);
    }

    private static void getCountOfChars(String str){
        char[] chars = str.toCharArray();
        Map<Character,Integer> freqMap = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {
            if(freqMap.containsKey(chars[i])){
                freqMap.put(chars[i],freqMap.get(chars[i])+1);
            }else {
                freqMap.put(chars[i],1);
            }
        }

        for (var map: freqMap.entrySet()){
            if(map.getValue()>1) {
                System.out.println(map.getKey() + " " + map.getValue());
            }
        }
    }
}

//driver.manage.implicitWait(Duration.SECONS(10));
//
//WebdriverWait wait = new WebdriverWait(driver,10);
//
//wait.until(ExpectedCondition.elementClickable(xpath));
//
//List<WebElements> options =driver.findElements(By.xpath("//div[@class="OBMEnb"]//following-sibling::li"));
//
//List<String> optionTextList = new Arraylist();
//for(WebElement option: options){
//    String optionText =option.getText();
//    if(optionText.indexOf("Automation")!=-1){
//        optionTextList.add();
//        }
//        }
//
//Set<String> tabs =getWindowHandles()
//driver.switchTo(tabs)
//
//
//
//git status
//
//git checkout -b newBranch
//
//git add .
//
//git commit -m "message"
//
//git push



