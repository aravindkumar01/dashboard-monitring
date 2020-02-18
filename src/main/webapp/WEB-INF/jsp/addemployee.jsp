<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Monitering</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="plugins/fontawesome-free/css/all.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Tempusdominus Bbootstrap 4 -->
  <link rel="stylesheet" href="plugins/tempusdominus-bootstrap-4/css/tempusdominus-bootstrap-4.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="plugins/icheck-bootstrap/icheck-bootstrap.min.css">
  <!-- JQVMap -->
  <link rel="stylesheet" href="plugins/jqvmap/jqvmap.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/adminlte.min.css">
  <!-- overlayScrollbars -->
  <link rel="stylesheet" href="plugins/overlayScrollbars/css/OverlayScrollbars.min.css">
  <!-- Daterange picker -->
  <link rel="stylesheet" href="plugins/daterangepicker/daterangepicker.css">
  <!-- summernote -->
  <link rel="stylesheet" href="plugins/summernote/summernote-bs4.css">
  <!-- Google Font: Source Sans Pro -->
  <link href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400i,700" rel="stylesheet">
</head>
<body class="hold-transition sidebar-mini layout-fixed" onload="myAppend()">

  <%--  <jsp:include page="menu.jsp" />  --%>
   <div class="content-wrapper">
   <ul class="navbar-nav" style="margin-left:30px;">
      <li class="nav-item">
        <a class="nav-link" data-widget="pushmenu" href="#"><i class="fas fa-bars"></i></a>
      </li>
     
    </ul>
    <!-- Content Header (Page header) -->
    <div class="content-header">
      <div class="container-fluid">
        <div class="row mb-2">
          <div class="col-sm-6">
            <h1 class="m-0 text-dark">Employee</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="/dashboard">Home</a></li>
              <li class="breadcrumb-item active">Add Employee</li>
            </ol>
          </div><!-- /.col -->
        </div><!-- /.row -->
      </div><!-- /.container-fluid -->
    </div>
    
    <!-- Main content -->
      <div class="main-content">
       <section class="content">
      <div class="container-fluid">
        <div class="row">
          <!-- left column -->
          
          <!--/.col (left) -->
          <!-- right column -->
          <div class="col-md-12">
            <!-- general form elements disabled -->
            <div class="card card-warning">
              <div class="card-header">
                <h3 class="card-title">Employee Details</h3>
              </div>
              <!-- /.card-header -->
              <div class="card-body">
                <form role="form" onsubmit="myFunction()">
                  <div class="row">
                    <div class="col-sm-6">
                      <!-- text input -->
                      <div class="form-group">
                        <label>First Name</label>
                        <input type="text" class="form-control" placeholder="Enter first name" id="firstname" required="required">
                      </div>
                    </div>
                    <div class="col-sm-6">
                      <div class="form-group">
                        <label>Last Name</label>
                        <input type="text" class="form-control" placeholder="Enter last name" id="lastname" required="required">
                      </div>
                    </div>
                  </div>
                  <div class="form-group">
                    <label>Department</label>
                    <select class="form-control" id="department">
                         
                          
                        </select>
                  </div>
                  
                  <div class="form-group">
                    <label>Role</label>
                    <select class="form-control" id="role">
                         
                          <option value="admin">Admin</option>
                          <option value="manager">Manager</option>
                          <option value="employee">Employee</option>
                        </select>
                  </div>
                  
				  <div class="form-group">
                    <label>Degree</label>
                    <input type="text" class="form-control" placeholder="Enter degree" id="degree">
                  </div>
                   <div class="form-group">
                    <label>Email</label>
                    <input type="email" class="form-control" placeholder="Enter email" id="email">
                  </div>
                  <div class="form-group">
                    <label>Date of birth</label>
                    <input type="date" class="form-control" placeholder="Enter date of brith" id="dob">
                  </div>
				  <div class="form-group">
                    <label>Gender</label>
                    <select class="form-control" id="gender">
                          <option value="male">Male</option>
                          <option value="female">Female</option>
                          
                        </select>
                  </div>
                  <div class="row">
                    <div class="col-sm-12 col-xs-12">
                      <!-- textarea -->
                      <div class="form-group">
                        <label>Address</label>
                        <textarea class="form-control" rows="3" placeholder="Enter your address" id="address" required="required"></textarea>
                      </div>
                    </div>                    
                  </div>

				<div class="row">
                    <div class="col-lg-3 col-xs-12">
                      <!-- Select multiple-->
                      <div class="form-group">
                        <label>State</label>
                         <input type="text" class="form-control" placeholder="Enter state" required="required">
                      </div>
                    </div>
                
                    <div class="col-lg-3 col-xs-12">
                      <!-- select -->
                      <div class="form-group">
                        <label>District</label>
                        
                          <input type="text" class="form-control" placeholder="Enter district" id="district">
                      </div>
                    </div>                   
                 
					<div class="col-lg-3 col-xs-12">
						<div class="form-group">
							<label>City</label>
							         <input type="text" class="form-control" placeholder="Enter city" id="city">
                
						</div>		
					</div>
					<div class="col-lg-3 col-xs-12">
						<div class="form-group">
							<label>Pincode</label>
							         <input type="number" class="form-control" placeholder="Enter pincode" id="pincode">
                
						</div>		
					</div>
					
                </div>
				<div class="row">
					<div class="col-md-6">
						<button type="submit" class="btn btn-block btn-success btn" id="saveEmployee">Save</button>
					</div>
					<div class="col-md-6">
						<button type="button" class="btn btn-block btn-info btn">Cancel</button>
					</div>	
				</div>
				
                </form>
								
              </div>
              <!-- /.card-body -->
            </div>
            <!-- /.card -->
            <!-- general form elements disabled -->
            
            <!-- /.card -->
          </div>
          </div>
          <!--/.col (right) -->
        </div>
        <!-- /.row -->
      </div><!-- /.container-fluid -->
    </section>
      </div>
    <!-- /.content -->
  </div>
  
  <!-- /.content-wrapper -->
 <jsp:include page="footer.jsp" />

  <!-- Control Sidebar -->
  <aside class="control-sidebar control-sidebar-dark">
    <!-- Control sidebar content goes here -->
  </aside>
  <!-- /.control-sidebar -->
</div>
<!-- ./wrapper -->

<!-- jQuery -->
<script src="plugins/jquery/jquery.min.js"></script>
<!-- jQuery UI 1.11.4 -->
<script src="plugins/jquery-ui/jquery-ui.min.js"></script>
<!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->
<script>
  $.widget.bridge('uibutton', $.ui.button)
</script>
<!-- Bootstrap 4 -->
<script src="plugins/bootstrap/js/bootstrap.bundle.min.js"></script>
<!-- ChartJS -->
<script src="plugins/chart.js/Chart.min.js"></script>
<!-- Sparkline -->
<script src="plugins/sparklines/sparkline.js"></script>
<!-- JQVMap -->
<script src="plugins/jqvmap/jquery.vmap.min.js"></script>
<script src="plugins/jqvmap/maps/jquery.vmap.usa.js"></script>
<!-- jQuery Knob Chart -->
<script src="plugins/jquery-knob/jquery.knob.min.js"></script>
<!-- daterangepicker -->
<script src="plugins/moment/moment.min.js"></script>
<script src="plugins/daterangepicker/daterangepicker.js"></script>
<!-- Tempusdominus Bootstrap 4 -->
<script src="plugins/tempusdominus-bootstrap-4/js/tempusdominus-bootstrap-4.min.js"></script>
<!-- Summernote -->
<script src="plugins/summernote/summernote-bs4.min.js"></script>
<!-- overlayScrollbars -->
<script src="plugins/overlayScrollbars/js/jquery.overlayScrollbars.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.js"></script>
<!-- AdminLTE dashboard demo (This is only for demo purposes) -->
<script src="dist/js/pages/dashboard.js"></script>
<!-- AdminLTE for demo purposes -->
<script src="dist/js/demo.js"></script>

<script>

$(document).ready(function(){
	  $.ajax({
	      type: "GET",	     
	      url: "/login/menu",	    
	      success :function(result) {
	    	  console.log(result);
	    	  $(".layout-fixed").append(result);
	    	
	     },
     error: function(e){          	   
  	  console.log(e)
  	   
  	   	        }
	  });
	
});


$(document).ready(function(){
	
	$.ajax({
		type: 'GET',
		dataType: 'json',
		contentType: 'application/json',
		url: "/department/all",
		success: function(data, textStatus ){
		console.log(data);
		 $.each(data,function( i,j ) {
		
			 $('#department')
	         .append($("<option></option>")
	                    .attr("value",j.name)
	                    .text(j.name)); 
			
			 
	   	  });
		 
		
		},
		error: function(xhr, textStatus, errorThrown){
		//alert('request failed'+errorThrown);
		}
		
		});
	
	
});


function myFunction(){
	var employee={"first_name":$("#firstname").val(),"last_name":$("lastname").val(),"department":$("#department").val(),
			"email":$("#email").val(),"degree":$("#degree").val(),"gender":$("#gender").val(),
			"dob":$("#dob").val(),"address":$("#address").val(),"pincode":$("#pincode").val(),
			"city":$("#city").val(),"district":$("#district").val(),"state":$("state").val(),"role":$("#role").val()};
	
	
	  $.ajax({
	      type: "POST",
	      contentType : 'application/json; charset=utf-8',
	      dataType : 'json',
	      url: "/employee/add",
	      data: JSON.stringify(employee),
	      success :function(result) {
	         if(result){
	        	 alert("Employee added!")
	         }
	     },
         error: function(e){          	   
      	  console.log(e)
      	   
      	   	        }
	  });
}


</script>
</body>
</html>
