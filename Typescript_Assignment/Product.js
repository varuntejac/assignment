var Product = /** @class */ (function () {
    function Product(i, n, s) {
        this.proid = i;
        this.proname = n;
        this.proprice = s;
    }
    Product.prototype.display = function (gst) {
        console.log("proid:" + this.proid);
        console.log("proname:" + this.proname);
        console.log("proprice:" + this.proprice);
        console.log("toatlprice with gst:" + this.proprice + gst);
    };
    return Product;
}());
var p = new Product(2, "mobile", 67889);
p.display(567);
