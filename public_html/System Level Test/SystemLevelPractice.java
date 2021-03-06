
//This codes shows a brief insight on steps on which a user can progress from stage to stage. register/login.

class Register extends Module
{
	/**
	 * configuration testing
	 *
	 */
	protected static $acceptanceSuiteConfiguration = [];
	/*
	 * Function to get Configuration from the acceptance.suite.yml to be used by a test
	 *
	
	 */
	public function getSuiteConfiguration()
	{
		if (empty(self::$acceptanceSuiteConfiguration))
		{
			self::$acceptanceSuiteConfiguration = Configuration::suiteSettings('acceptance', Configuration::config());
		}
		return self::$acceptanceSuiteConfiguration;
	}
}



<?php

	$action = filter_input(INPUT_POST, 'action');
	if ($action == NULL){
	 $action = filter_input(INPUT_GET, 'action');
	}



	switch ($action){

// Code to deliver the views will probably be here

case 'register':
   
// Filter and store the data
  $clientFirstname = filter_input(INPUT_POST, 'clientFirstname', FILTER_SANITIZE_STRING);
  $clientLastname = filter_input(INPUT_POST, 'clientLastname', FILTER_SANITIZE_STRING);
  $clientEmail = filter_input(INPUT_POST, 'clientEmail', FILTER_SANITIZE_EMAIL);
  $clientPassword = filter_input(INPUT_POST, 'clientPassword', FILTER_SANITIZE_STRING);

$clientEmail = checkEmail($clientEmail);
$checkPassword = checkPassword($clientPassword);

/*check email */
$existingEmail = checkExistingEmail($clientEmail);
if($existingEmail){
  $message = '<p class="notice">That email address already exists. Do you want to login instead?</p>';
  include $_SERVER['DOCUMENT_ROOT'] . '/acme/view/login.php';
  exit;
}

// Check for missing data
if(empty($clientFirstname) || empty($clientLastname) || empty($clientEmail) || empty($checkPassword)){

	if(!is_null($clientFirstname)){
  			$message = '<p>Please provide information for all empty form fields.</p>';
  }
  include $_SERVER['DOCUMENT_ROOT'] . '/acme/view/registration.php';
  exit;
}

// Hash the checked password
$hashedPassword = password_hash($clientPassword, PASSWORD_DEFAULT);

 // Send the data to the model
$regOutcome = regClient($clientFirstname, $clientLastname, $clientEmail, $hashedPassword);

// Check and report the result
if($regOutcome === 1){


  $message = "<p>Thanks for registering $clientFirstname. Please use your email and password to login.</p>";

  include $_SERVER['DOCUMENT_ROOT'] . '/acme/view/login.php';
  exit;
} else {
    
  $message = "<p>Sorry $clientFirstname, but the registration failed. Please try again.</p>";
  include $_SERVER['DOCUMENT_ROOT'] . '/acme/view/registration.php';
  exit;
}
break;
case 'Login':

  $clientEmail = filter_input(INPUT_POST, 'clientEmail', FILTER_SANITIZE_EMAIL);
  $clientPassword = filter_input(INPUT_POST, 'clientPassword', FILTER_SANITIZE_STRING);

	$clientEmail = checkEmail($clientEmail);
	$checkPassword = checkPassword($clientPassword);

// Check for missing data
if(empty($clientEmail) || empty($checkPassword)){
    
    
        
  $message = '<p>Please provide information for all empty form fields.</p>';
    
  include $_SERVER['DOCUMENT_ROOT'] . '/acme/view/login.php';
  exit;
}

break;

default:


	include $_SERVER['DOCUMENT_ROOT'] .'/acme/view/login.php';


}

?>