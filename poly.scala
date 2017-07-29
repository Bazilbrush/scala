class One{
	var x  = 10
	def message(){
		println("sup!")
	}
}
class two extends One{
	def message(){
		println("mehh!")
		}	
	
}
//var x = new One()
var x:One = new two()
x.message()