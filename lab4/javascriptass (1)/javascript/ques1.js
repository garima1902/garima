function showdate()
{
var a=new Date();

document.wite(a.toUTCString());
document.writeln(a.getDate()+"<br/>");
document.writeln(a.getMonth());
document.writeln(a.getFullYear());
}

