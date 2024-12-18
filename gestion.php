<?php

$page=$_GET['page']??'';

if ($page=="contact") { include("php/contact.php"); }
elseif($page=="acceuil") { include("php/acceuil.php"); }
elseif($page=="apropos") { include("php/about.php"); }
elseif ($page=="blog") { include("php/blog.php"); }
elseif($page=="detail") { include("php/post-detatils.php"); }
else { include("php/acceuil.php"); }








?>