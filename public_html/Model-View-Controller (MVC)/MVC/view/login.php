<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Home -- ACME Foods">
	<meta name="author" content="CIT 360 -- BYUI">
	<link href="https://fonts.googleapis.com/css?family=Bangers%7CLora" rel="stylesheet"> 
	<link rel="stylesheet" type="text/css" href="/acme/css/major.css">
	<link rel="stylesheet" type="text/css" href="/acme/css/medium.css">
	<link rel="stylesheet" type="text/css" href="/acme/css/small.css">
	<link rel="stylesheet" type="text/css" href="/acme/css/large.css">
	<link rel="stylesheet" type="text/css" href="/acme/css/normalize.css">
    
        
	<title>ACME LOGIN</title>
</head>
<body>



<header>
		<?php include $_SERVER['DOCUMENT_ROOT'] . '/acme/common/header.php'; ?> 

	</header>


	<div class="all">

					<h1>ACME LOGIN</h1>
		<?php
if (isset($message)) {
 echo $message;
}
?>


<div class="log">
	
	
	
    <form method="post" action="/acme/accounts/">
        <fieldset>
        <h4>Email Address</h4>
    <input type="email" name="clientEmail" id="clientEmail" <?php if(isset($clientEmail)){echo "value='$clientEmail'";} ?> required autofocus><p></p>
    	 <p></p>
    	 <h4>Password</h4>
        <label><input type="password" name="clientPassword" id="clientPassword" required pattern="(?=^.{8,}$)(?=.*\d)(?=.*\W+)(?![.\n])(?=.*[A-Z])(?=.*[a-z]).*$"></label><br>
 <div class ="smart">Passwords must be at least 8 characters and contain at least 1 number, 1 capital letter and 1 special character</div>
        	 <p></p>
        	 
        <button type="submit" class="btn btn-primary btn-block btn-large">
            Login</button>
              </fieldset>
             </form>
          
   



   <h1> Not a member</h1>
    <br>
      <input type="hidden" name="action" value="Login"> 
<h1><a href="/acme/accounts/index.php?action=register">Create an Account</a> </h1>
<p></p>

</div>

	<footer>
		<?php include $_SERVER['DOCUMENT_ROOT'] . '/acme/common/footer.php'; ?> 
 		
	</footer>
  </div>
  </body>
  </html>