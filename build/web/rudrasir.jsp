<%-- 
    Document   : menu
    Created on : 30 Aug, 2022, 11:56:15 PM
    Author     : RUDRA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu </title>
        <link href='https://fonts.googleapis.com/css?family=Poppins' rel='stylesheet'>
        <link href="style.css" rel="stylesheet">
        <script type="module" src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.esm.js"></script>
        <script nomodule src="https://unpkg.com/ionicons@5.5.2/dist/ionicons/ionicons.js"></script>
    </head>
    <style>       
        *, *::before, *::after { box-sizing: border-box;}
        :root{
            --colorPink: #CE3061;
            --colorBlueLight-clr: #8ed1fc;
            --colorGreen: #006241;
            --colorGreenDark: #1e3932;
            --colorGreenLight: #d4e9e2;
            --primary-font: "Poppins", Sans-serif;
        }

        body{
            background-color: rgb(7, 20, 13);
            margin: 0;
            padding: 0;
            font-family: var(--primary-font);
            color: white;
            min-height: 100vh;
        } 

        .main img{
            border-radius: 50%;
            width: 120px;
            height: 120px;
        }

        body :is(.type1, .type2 ,.type3){
            font-size: 1.5rem;
            display: flex;
            flex-direction: column;
        }

        .main a{
            all: unset;
        }

        button{
            all: unset;
            background-color: white;
            color: black;
            width: 70px;
            border: 1px solid white;
            padding: .25rem .50rem .25rem .50rem;
            border-radius: 30px;
            transition: all 200ms ease-out;
        }

        button:hover{
            background-color: transparent;
            position: relative; 
            color: transparent;
            cursor: pointer;
        }

        button:hover::before{
            content: attr(price);
            color: pink;
            position: absolute;
            margin-left: 7px;
        }

        .cart{
            width: 100%;
            height: 50px;
            padding: 20px 150px 20px 30px;
            background-color: var(--colorGreenDark);
            display: flex;
            align-items: center;
            justify-content: flex-end;
            gap: 80em;
            position: fixed;
            bottom: 0;
        }

        .cart ion-icon{
            color: white;
            font-size: 20px;
        }

        .main{
            display: flex;
            justify-content: space-between;
            align-items: center;
            text-align: center;
            margin: 100px auto 100px auto;
            width: 80%;
            font-size: .75rem;
        }

        .item{
            padding: 2rem;
        }

        @media(max-width: 980px){
            .main{
                display: block;
            }          
        }

        

    </style>
    <body>
        <%--<%@include file="nav.jsp"%>--%>
        <div class="main">
            <div class="col">
                <div class="type1">
                    <p>Beverages</p>
                </div>
                <div class="item">
                    <img src="items/beverage1.png">
                    <p>Pumpkin Spice Frappuccino</p>
                    <a href="addto_cart"><button price="add">13.75$</button></a>
                </div> 

                <div class="item">
                    <img src="items/beverage2.png">
                    <p>Matcha Crème Frappuccino</p>
                    <a href="cart.jsp"><button price="add">15.00$</button></a>
                </div>  

                <div class="item">
                    <img src="items/beverage3.png">
                    <p>Strawberry Crème</p>
                    <a href="cart.jsp"><button price="add">17.25$</button></a>
                </div> 
            </div>

            <div class="col">               
                <div class="type2">
                    <p>Bakery</p>
                </div>
                <div class="item">
                    <img src="items/snack1.png">
                    <p>Lime-Frosted Coconut Bar</p>
                    <a href="cart.jsp"><button price="add">10.00$</button></a>
                </div> 

                <div class="item">
                    <img src="items/snack2.png">
                    <p>Ham & Swiss Croissant</p>
                    <a href="cart.jsp"><button price="add">25.00$</button></a>
                </div> 

                <div class="item">
                    <img src="items/snack3.png">
                    <p>Glazed Doughnut</p>
                    <a href="cart.jsp"><button price="add">18.00$</button></a>
                </div>
            </div>

            <div class="col">
                <div class="type3">
                    <p>Refreshers</p>
                </div>
                <div class="item">
                    <img src="items/cold_drink1.png">
                    <p>Strawberry Açaí Lemonade</p>
                    <a href="cart.jsp"><button price="add">45.00$</button></a>
                </div>               
                <div class="item">
                    <img src="items/cold_drink2.png">
                    <p>Paradise Drink</p>
                    <a href="cart.jsp"><button price="add">55.00$</button></a>
                </div>  
                <div class="item">
                    <img src="items/cold_drink3.png">
                    <p>Dragon Drink</p>
                    <a href="cart.jsp"><button price="add">65.00$</button></a>
                </div> 
            </div>
        </div>
        <div class="cart">
            <a href="cart.jsp">
                <ion-icon name="cart-outline"></ion-icon>
            </a>
        </div>
    </body>
</html>
