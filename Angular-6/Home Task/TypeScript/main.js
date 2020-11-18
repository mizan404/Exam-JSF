var s = "Mizan";
console.log(s);
var message = function () {
    console.log("This message is shown after 3 seconds");
};
setTimeout(message, 3000);

<button id="callback-btn">Click here</button>

document.queryselector("#callback-btn")
    .addEventListener("click", function() {    
      console.log("User has clicked on the button!");
});
