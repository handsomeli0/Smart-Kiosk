# Smart Kiosk
This is Group 102's project in EBU6304.

## Development Environment
- Windows 10
- JDK-15.0.1

## How to Run
1. Download Smart-Kiosk.zip and uncompress it.
2. Change directory to xxx/Smart-Kiosk in CMD.  
   eg. 
    `cd C:\Users\86156\Desktop\Smart-Kiosk`
3. Enter this command:  
   `java -jar Smart-Kiosk.jar`
   
***Please make sure Smart-Kiosk.jar, /src/, /data/ are in the same directory!**

## Test Cases
1. Booking Number: bk1  
   First Name: Tom  
   Surname: Bliboo  
   ID Number: id01  
   Credit Card ID: 100001
   

2. Booking Number: bk2  
   First Name: Makka  
   Surname: Pakka  
   ID Number: id02  
   Credit Card ID: 100002  
   (The default ID document belongs to this passenger. You can modify ID document in /peripherals/IDdocument.json)
   

3. Booking Number: bk3  
   First Name: Upsy  
   Surname: Daisy  
   ID Number: id03  
   Credit Card ID: 100003
   

4. Booking Number: bk4  
   First Name: Iggle  
   Surname: Piggle  
   ID Number: id04  
   Credit Card ID: 100004
   
## How to Modify the ID Document
You can find **IDdocument.json** in **/Smart-Kiosk/peripherals/**. Feel free to change it(**don't forget to save the file**) when you are using our software.

An example of IDdocument.json: `{"firstName":"Makka","lastName":"Pakka","idNum":"id02"}`

## How to get the printed Boarding Pass, Tag, and Ticket
After you successfully confirmed the check-in at the end of our software, the boarding pass, tag, and ticket will be automatically printed as .jpg images into **/Smart-Kiosk/peripherals/**. You can find and open them in that directory.

## How to get the Passengers List
When a user finished her/his check-in, her/his check-in information will be automatically appended to the file **Check-In Information.csv** in **/Smart-Kiosk/peripherals/**. This file will be useful for the airline staff to visualize, for each flight, the list of passengers and their check-in status, so please don't modify this file.