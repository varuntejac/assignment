class Product{
    proid:number;
    proname:string;
    proprice:number;

    constructor(i:number,n:string,s:number){
        this.proid=i;
        this.proname=n;
        this.proprice=s;
    }

    display(gst:number){
        console.log("proid:"+this.proid);
        console.log("proname:"+this.proname);
        console.log("proprice:"+this.proprice);
        console.log("toatlprice with gst:"+this.proprice+gst);
        
    }


}
var p=new Product(2,"mobile",67889);
p.display(567);