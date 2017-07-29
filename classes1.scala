class Greeter(message: String, secondaryMessage: String) {
    def this(message: String) = this(message, "")
    
    def SayHi() = println(message + secondaryMessage)
}

//val greeter = new Greeter("Hello world!")
//greeter.SayHi()

class one{
	def message(){
		println("hello world!")
	}
}

class two extends one{
	override def message(){
		println("fuck you!")


	}
}

var lol = new two()
lol.message()
var lol2 = new Greeter("fuck your mum", " and your dad")
lol2.SayHi()