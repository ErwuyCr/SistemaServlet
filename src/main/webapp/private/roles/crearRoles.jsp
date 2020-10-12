<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

    <style>
        @import url('https://fonts.googleapis.com/css2?family=Quicksand:wght@300;400;500;600;700&display=swap');


        body {
            font-family: 'Quicksand', sans-serif;
        }
    </style>

</head>

<body>


    <div id="wrapper" class="container-fluid vh-100">
        <div class="row h-100">
            <nav id="sideBar" class="col-sm-2 h-100 bg-light pt-2 border-right">
                <div class="side-header d-flex justify-content-center">
                    <img src="lion_logo.png" class="img-fluid mb-2" width="100" height="100" alt="logo">
                </div>
                <div class="menu row">
                    <div class="col-12">
                        <div class="list-group">
                            <a class="list-group-item list-group-item-action" href="../index.jsp"
                                aria-controls="home">Home</a>

                            <a class="list-group-item list-group-item-action " data-toggle="collapse"
                                href="#Sub_Usuario" aria-expanded="false" aria-controls="Sub_Usuario">Usuario</a>

                            <a id="Sub_Usuario" class="list-group-item list-group-item-action collapse"
                                href="crearUsuario.jsp" aria-controls="profile">Crear Usuario</a>
                            <a id="Sub_Usuario" class="list-group-item list-group-item-action collapse"
                                href="listarUsuario.jsp" aria-controls="profile">Listar Usuario</a>

                            <a class="list-group-item list-group-item-action" data-toggle="collapse" href="#Sub_Role"
                                aria-expanded="false" aria-controls="Sub_Role">Roles</a>

                            <a id="Sub_Role" class="list-group-item list-group-item-action collapse"
                                href="crearRoles.jsp" aria-controls="profile">Crear Roles</a>
                            <a id="Sub_Role" class="list-group-item list-group-item-action collapse"
                                href="listarRoles.jsp" aria-controls="profile">Listar Roles</a>
                        </div>
                    </div>
                </div>
            </nav>

            <div id="main" class="col-sm-10 bg-light pl-0">
                <div class="header text-white p-3" style="background-color: #634293;">
                    <h1>Crear Rol</h1>
                </div>
                <div class="row p-5">
                    <div class="col-12">
                        <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Ea facere corporis culpa temporibus
                            dolores
                            qui est
                            praesentium, saepe reiciendis, odio accusantium ab illo voluptas aperiam minus voluptate
                            incidunt
                            necessitatibus
                            quaerat?</p>
                        <form>
                            <div class="form-row">
                                <div class="form-group col-md-8">
                                    <label for="inputName">Nombre del Rol</label>
                                    <input type="text" class="form-control" id="inputRole">
                                </div>
                            </div>
                            <div class="form-row ">
                                <div class="form-group col-md-8 p-0">
                                    <label for="inputLastName">Descripcion</label>
                                    <textarea class="form-control" row="3" id="inputDescripcion" style="resize: none;"></textarea>
                                </div>
                            </div>
                            
                            <div class="form-row">
                                <button type="submit" class="btn btn-primary">Guardar</button>
                                <button type="button" class="btn btn-danger ml-2">Cancelar</button>
                            </div>
                        </form>


                    </div>
                </div>
            </div>
        </div>
    </div>



    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
        integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
        crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
        integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
        crossorigin="anonymous"></script>

</body>

</html>