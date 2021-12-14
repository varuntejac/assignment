const fs = require('fs');
const path = require('path');

fs.readFile(path.join(__dirname,'/Training Details','studentdetails.txt'),'utf8',(err,data)=>{
    if(err)throw err;
    console.log(data);
});
module.exports=Studentdetails;
