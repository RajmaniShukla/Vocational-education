<!DOCTYPE html>
<head>
<style>
div#test{ border:#000 1px solid; padding:10px 40px 40px 40px; }
</style>
<script>
var pos = 0, test, test_status, question, choice, choices, chA, chB, chC, correct = 0;
var questions = [
    [ "1.I leave everything eles when it is time for me study.", "True", "Most of the time", "False"],
	[ "2).I eat my meals at fixed times daily.", "May be", "All the time", "No", "B" ],
	[ "3.Given an option to attend tuition classes, you will attend", "At home", "IN group", "In class", "C" ],
	[ "4.I remember everything that is spoken in the class", "True", "False", "Most of the times", "A" ],
        [ "5.Do you like to be compared with your friends?", "Yes", "No", "Some times", "B" ],
        [ " 6.I like to keep my phone with me even while studying.", "Most of the times", "No", "Yes", "B" ],
        [ "7.I have a fixed place in my home where I sit and study.", "No", "Yes", "Mostly", "A" ],
        [ "8.I study with my friends.", "No", "Yes", "Some times", "B" ],
        [ "9.Given an option to do eLearning, you will say.", "Yes", "No", "Some times", "A" ],
        [ "10.I know what subjects I will take up in Class XI and Class XII.", "Yes", "No", "Some Things", "A" ],
        [ "11.I play an outdoor game daily", "No", "Yes", "Mostly", "C" ],
        [ "12.I love to learn through practical demonstrations", "No", "I like Theories", "Yes", "C" ],
        [ "13.I don't feel tired after my studies", "Yes", "No", "Sometimes", "C" ],
        [ " 14.Do you leave a topic midway If you don't understand it?", "Yes", "Some Times", "No", "C" ],
        [ "15.Given an option to appear for Competitive/Entrance Exams, you will", "For Better college", "For Better Learning", "Highly Graduate facalities", "B" ],
        [ "16. My family members always encourage me to do well", "Yes", "Not Often", "No", "B" ],
        [ "17.Do you discuss your problems with your teacher(s)?", "Yes", "No", "Sometimes", "A" ],
        [ "18.Do you have a time table at home?", "No", "Yes", "Never", "B" ],
        [ "19.Do you have a fixed time to sleep?", "No", "Yes", "Not often", "C" ],
        ["have you like to listioning songs while studying?","Yes","No","Mostly","B"]
    ];
function _(x){
	return document.getElementById(x);
}
function renderQuestion(){
	test = _("test");
	if(pos >= questions.length){
		test.innerHTML = "<h2>You got "+correct+" of "+questions.length+" questions correct</h2>";
		_("test_status").innerHTML = "Test Completed";
		test.innerHTML += "<a href='#'>Re-test</a>";
		test.innerHTML += "<button>Done</button>";
		pos = 0;
		correct = 0;
		return false;
	}
	_("test_status").innerHTML = "Question "+(pos+1)+" of "+questions.length;
	question = questions[pos][0];
	chA = questions[pos][1];
	chB = questions[pos][2];
	chC = questions[pos][3];
	test.innerHTML = "<h3>"+question+"</h3>";
	test.innerHTML += "<input type='radio' name='choices' value='A'> "+chA+"<br>";
	test.innerHTML += "<input type='radio' name='choices' value='B'> "+chB+"<br>";
	test.innerHTML += "<input type='radio' name='choices' value='C'> "+chC+"<br><br>";
	test.innerHTML += "<button onclick='checkAnswer()'>Submit Answer</button>";


}

function checkAnswer(){
	choices = document.getElementsByName("choices");
	for(var i=0; i<choices.length; i++){
		if(choices[i].checked){
			choice = choices[i].value;
		}
	}
	if(choice == questions[pos][4]){
		correct++;
	}
	pos++;
	renderQuestion();
}
window.addEventListener("load", renderQuestion, false);
</script>

<script>
var limit="00:10"
if (document.images){
var parselimit=limit.split(":")
parselimit=parselimit[0]*60+parselimit[1]*1
}
//function begintimer(){
//if (!document.images)
//return
//if (parselimit==1)
//window.location="msg.html"
//else{ 
//parselimit-=1
//curmin=Math.floor(parselimit/60)
//cursec=parselimit%60
//if (curmin!=0)
//curtime=curmin+" minutes and "+cursec+" seconds left"
//else
//curtime=cursec+" seconds left"
//window.status=curtime
//setTimeout("begintimer()",1000)
//}
//}

</script>
</head>
<body>
<h2 id="test_status"></h2>
<div id="test"></div>
 <form>
     <a href="yourfuture.html" rel="next"><h1>Carier</h1></a>
    </form>
</body>
</html>
