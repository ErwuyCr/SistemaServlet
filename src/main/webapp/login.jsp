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
	
		<div class="container vh-100">
			<div class="row h-100">
				<div class="col-md-4 border rounded m-auto">
					<div class="row bg-dark">
						<div class="col-12 p-2 text-white">
							<h1 class="text-center">Login</h1>
						</div>
					</div>
					<div class="row"> 
						<div class="col-12 text-white" style="background-color: #634293;">
							<form action="Login" method="post" class="pt-4">
								<div class="form-group">
									<label for="">Usuario</label>
									<input class="form-control" type="text" name="user">
								</div>
								<div class="form-group">
									<label for="">Password</label>
									<input class="form-control" type="password" name="pass">
								</div>
								<div class="form-group pt-4">
									<button type="submit" class="btn btn-primary">Sign in</button>
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