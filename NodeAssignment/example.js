const fs = require('fs');
const path=require('path');
__dirname="C:\Users\TEJA\eclipse-workspace"
fs.readFile(path.join(__dirname,'/JDBCBeanProject','/src','/com','/sonata','/Model','/Task.java'),'utf8',(err,data)=>{if(err)throw err;
    console.log(data);
});