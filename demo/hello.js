<html>
<body>
<script>
    var mang=[1,2,3,4,5,6];
    function sumarray() {
var sum = 0;
for(i=0;i<mang.length;i++){
    sum = sum + mang[i];
}
return sum;
}
document.write("tong cac so trong mang la " + sumarray(mang));

</script>
</body>
</html>