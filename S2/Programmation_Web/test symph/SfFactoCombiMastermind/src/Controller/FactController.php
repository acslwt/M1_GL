<?php

namespace App\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\AbstractController;
use Symfony\Component\HttpFoundation\Response;
use Symfony\Component\HttpFoundation\Request;
use Symfony\Component\Routing\Annotation\Route;

function fact(int $n){
    $results = 1;
    for($i = 1; $i <= $n; $i++) {
        $results *= $i; 
    }
    return $results;
}

class FactController extends AbstractController{

    #[Route('/', name: 'app_fact',methods:"GET")]
    public function index(Request $n): Response{

        $value = $n->query->get('nombre');

        return $this->render('fact/index.html.twig', [
            'controller_name' => 'FactController',
            'value' => fact($value),
        ]);
    }
}
