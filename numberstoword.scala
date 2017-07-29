var input:String = "9999"
var ones:String = ""
var tens:String = ""
var hund:String = ""
var thou:String = ""
 






def convertones(input:Int):String=
{
	input match{

	case 0 => "";

	case 1 => "one";

	case 2 => "two";

	case 3 => "three";

	case 4 => "four";

	case 5 => "five";

	case 6 => "six";

	case 7 => "seven";

	case 8 => "eight";

	case 9 => "nine";
	}
}

def converttens(input:Int):String=
{
	input match{

	case 0 => "";

	case 1 => "ten";

	case 2 => "twenty";

	case 3 => "thirty";

	case 4 => "fourty";

	case 5 => "fifty";

	case 6 => "sixty";

	case 7 => "seventy";

	case 8 => "eightty";

	case 9 => "ninety";
	}
}

for (i <- 3 to 0 by -1  ) {
	var x = input.substring(i, i+1)
	var y:Int = x.toInt
	if (i == 3)
	{
		ones = (convertones(y))
	}
	if (i == 2)
	{
		tens = (converttens(y))
	}
	if (i == 1)
	{
		if (y != 0)
		{
		hund = (convertones(y)+" "+"hundred")
		}else{ hund = "" }

	}
	if (i == 0)
	{
		thou = (convertones(y)+" "+"thousand")
	}
	//print(convert(y))
	// println(input.substring(i, i+1))
}
print (thou+" "+hund+" "+" "+" "+tens+" "+ones)