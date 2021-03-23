console.log("hello canvas")

var canvas = document.getElementById("canvas");
var ctx;
var img;
var pos = {x:0 , y:0};



function clear() {
    console.log("clear")
    ctx.fillStyle="black";
    ctx.fillRect(0 ,0,500,500);
}

function save() {
    console.log("Save")
}

function getPosition(e) {
    console.log(e.clientX);
    pos.x = e.clientX;
    pos.y = e.clientY - 200;
    console.log(e.clientY);
}

function draw(e) {
    if (e.buttons != 1) {
        return;
    }
    ctx.beginPath();
    ctx.lineWidth = 10;
    ctx.lineCap = "round";
    ctx.strokeStyle = 'white';
    ctx.moveTo(pos.x,pos.y);

    getPosition(e);
    ctx.lineTo(pos.x,pos.y);
    ctx.stroke();
    console.log("oke")
}

function init(){
    var btnclear = document.getElementById("btnClear");
    var btnsave = document.getElementById("btnSave");
    btnclear.addEventListener("click", clear);
    btnsave.addEventListener("click", save);

    canvas = document.getElementById("canvas");
    ctx = canvas.getContext("2d");
    ctx.fillStyle="black";
    ctx.fillRect(0 ,0,500,500);

    canvas = document.addEventListener("mousedown", getPosition);
    canvas = document.addEventListener("mousemove", draw);

}

document.addEventListener("DOMContentLoaded", init);
