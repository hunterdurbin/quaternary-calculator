<h1>Quarternary Calculator Group 4 (update me after everything works)</h1>

<h2>How to Use</h2>
<p1>
    Click on a number to choose an operating number. 
    Then press one of the buttons for the corresponding operation: 
</p1>
<ul>
    <li>'+' for addition with the next digit entered</li>
    <li>'-' for subtraction with the next digit entered</li>
    <li>'*' for multiplication  with the next digit entered</li>
    <li>'/' for division with the next digit entered</li>
    <li>'^' for giving the previous digit an integer with the next digit entered</li>
    <li>'square-root' for finding the square root of previous digit</li>
</ul>
<p>
    To display your answer, simply press the '='. You can also press 'C' to clear the current operation.
</p>

<h2>General Idea of Process</h2>
<ol type = 1>
    <li>The user will interact with the [display] class by entering numbers and operations (base4)</li>
    <li>The [display] class will send that input to the Converter class</li>
    <li>Inside the Converter class, the base 4 input will be converted to base 10</li>
    <li>The edited input will be sent from the Converter class to the Calculator class</li>
    <li>The Calculator class will calculate the operation in base 10</li>
    <li>The answer will be sent from the Calculator class to the Converter class</li>
    <li>The answer will be converted from base 10 into base 4</li>
    <li>The answer will be sent from the Converter class to the [display] class</li>
    <li>The [display] class will be shown to the user</li>
</ol>

<h2>Teamwork</h2>
<h3>Members</h3>
<ul>
    <li>Colin Ferguson</li>
    <li>Dotty Horsman</li>
    <li>Eric Vester</li>
    <li>Ethan Holland</li>
    <li>Hunter Durbin</li>
    <li>Jake Chappell</li>  
</ul>

<h3>Meetings</h3>
<ul>
    <li>9/10/21 5:00pm to 6:10pm - Everyone attended: 
        Talked about setting up the repository. 
        Planned out task distribution. 
        Created small task list of the general ideas of the project. 
        Planned out a few classes that might be needed for the project such as convertor and calc class. 
        Went over functional requirements and talked about problems.
        Had the team split up into two main groups: 2 people on UI, 4 people on logic. (not set in stone. Just something to keep us focused)</li>
</ul>

<h2>Assigned Tasks</h2>

BaseConvertor Class 
- [X] converts base 4 to base 10 (Hunter)
- [X] related test are made and pass (Hunter)
- [X] converts base 10 to 4 (Jake)
- [ ] related test are made and pass (?)




Calculator Class
- [X] Addition (Jake)
- [ ] Related test are made and pass (Jake)
- [X] Subtraction (Jake)
- [ ] Related test are made and pass (Jake)
- [X] Multiplication (Jake)
- [ ] Related test are made and pass (Jake)
- [X] Division (Jake)
- [ ] Related test are made and pass (Jake)
- [ ] Square root (Jake)
- [ ] Related test are made and pass (Jake)
- [ ] Squared (Jake)
- [ ] Related test are made and pass (Jake)


[display] class


Text display

- [ ] When a user presses a button, related digit is shown (?)

‘Toggle’ button & indicator on display 
- [ ] Pressing this button, converts digit currently shown to the other base (?)
- [ ] It also changes the indicator on the display (4 → 10 or 10 → 4) (?)


- [ ] 0 button with connection to related logic (?)
- [ ] 1 button with connection to related logic (?)
- [ ] 2 button with connection to related logic (?)
- [ ] 3 button with connection to related logic (?)
- [ ] ‘=’ button with connection to related logic (?)
- [ ] ‘+’ button with connection to related logic (?)
- [ ] ‘-’ button with connection to related logic (?)
- [ ] ‘/’ button with connection to related logic (?)
- [ ] ‘*’ button with connection to related logic (?)
- [ ] ‘c’ button  with connection to related logic (?)
- [ ] Squaring button with connection to related logic (?)
- [ ] Square rooting button with connection to related logic (?)

Controller Class
- [ ] sends info to and from each class (?)


- [ ] All tests pass (Everyone)

README.md contains ...
- [ ] An explanation of the project (Dotty)
- [ ] Dependencies (Dotty)
- [ ] Tasks and division of labor → “ ‘name of team member’ = ‘task of the team member’ in each line.’ (Dotty)
- [ ] List of meetings that includes who attended, medium of meeting and points of discussion (Hunter)

<h2>Dependencies</h2>
<ul>
    <li>testCompile('org.junit.jupiter:junit-jupiter-api:5.3.1')</li>
    <li>testCompile('org.junit.jupiter:junit-jupiter-engine:5.3.1')</li>
</ul>



















