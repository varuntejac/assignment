class Reverse{
    myArr:number[]=[12,34,45,67,88,33];

    index(){
        for(var i=this.myArr.length-1;i>=0;i--)
        {
            console.log(this.myArr[i]);
        }
    }
}

var r= new Reverse();
r.index();