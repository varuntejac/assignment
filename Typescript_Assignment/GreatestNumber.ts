class GretestNumber {
    A:number=12;
    B:number=25;
    c:number=89
    greatestNumber():number
    {
        if(this.A>this.B && this.A>this.c)
        {
            return this.A;
        }
        else if(this.B>this.c && this.B>this.A)
        {
            return this.B;
        }
        else
        {
            return this.c;
        }
    }
   
}
var n=new GretestNumber()
console.log(n.greatestNumber());