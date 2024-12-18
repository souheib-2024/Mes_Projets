<?php

class Articles {
    
    private $dsn = 'mysql:dbname=site;host=127.0.0.1';
    private $user = 'root';
    private $password = '';
    private $db;

public function __construct (){
    $this->db = new PDO($this->dsn, $this->user, $this->password);
}

function obtenirArticles() {

        $query = $this->db->query('SELECT * FROM article');
        $articles = $query->fetchAll(PDO::FETCH_ASSOC);
        return $articles;
    
}

}

?>