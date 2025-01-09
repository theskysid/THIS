function validation() {
    var N = document.Registration.uname.value;
    var EmailID = document.Registration.EmailID.value;
    var mob = document.Registration.mnum.value;

    // Name Validation
    if (!isNaN(N)) {
        alert("Please enter a valid name.");
        return false;
    }

    // Email Validation
    var atposition = EmailID.indexOf('@');
    var depos = EmailID.lastIndexOf('.');
    if (atposition < 1 || depos - atposition <= 3 || !isNaN(EmailID.charAt(0))) {
        alert("Please enter a valid email address.");
        return false;
    }

    // Mobile Number Validation
    if (mob.length !== 10 || isNaN(mob)) {
        alert("Please enter a valid 10-digit mobile number.");
        return false;
    }

    

    return true; // Form is valid
}
