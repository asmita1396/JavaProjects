
function display(){
	var hd = document.getElementById('hellodiv');
	hd.innerHTML = 'Clicked...';
}


function greetings() {
	var sum= myFunction('7','7');
	alert(sum);
	var sum= myFunction(7,7);
	alert(sum);
	
	//sum(7,7);
	//sum('7','7');
}



/*function sum(num1, num2){
	var result= num1+num2;
	alert(result);
}*/

var myFunction= function(num1,num2){
	return num1+num2;
}

function test1(){
	var var1= 1; //local variable
	var2= 2; //global variable
}
test1();

function test3(){
	alert(var2);
}
test3();

function test2(){
	alert(var1);
}
test2();

