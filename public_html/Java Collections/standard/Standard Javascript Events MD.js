
            function setUpEvents() {
                var content = document.getElementById("content");
                var button = document.getElementById("show more");
                
                button.onclick = function(){
                    if (content.className == "open"){
                        //shrink the box
                        content.className ="";
                        button.innerHTML = "Show More";
                    }else{
                        //open more the box
                        content.className = "open";
                        button.innerHTML = "show Less";
                        
                    }
                };
            }
            
            window.onload = function(){
                setUpEvents();
            }
  
