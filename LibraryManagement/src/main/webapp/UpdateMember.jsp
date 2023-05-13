<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Update Member Information</title>
  <link rel="stylesheet" type="text/css" href="updatemember.css">
</head>
<body>

  <div class="container">
    <div class="form-container">
      <h1>Update Member Information:</h1>
      <form action="UpdateMember" method="post">
        <label for="id">Member ID:</label>
        <input type="text" id="id" name="id" required><br><br>
        <label for="name">Member Name:</label>
        <input type="text" id="name" name="name" required placeholder="Member Name"><br><br>    
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required placeholder="Email"><br><br>
        <label for="phone">Phone Number:</label>
        <input type="tel" id="phone" name="phone" required placeholder="Phone Number"><br><br>
       

        <input type="submit" value="Update">
      </form>
    </div>

    <div class="content-container">
      <div class="updatemember-info">
        <h2>About Update Member:</h2>
        <p>
          The Update Member feature allows users to modify their member information, including name, email, phone number, and password.
          To update the information, fill in the fields above and click the "Update" button.
        </p>
        <p>
          Please make sure to enter the correct information and provide a strong and secure password to protect your account.
        </p>
      </div>
    </div>
  </div>

</body>
</html>
