<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

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
<body class="hold-transition sidebar-mini layout-fixed">

    
    
  <%--  <jsp:include page="menu.jsp" /> --%>
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
            <h1 class="m-0 text-dark">Meeting</h1>
          </div><!-- /.col -->
          <div class="col-sm-6">
            <ol class="breadcrumb float-sm-right">
              <li class="breadcrumb-item"><a href="/dashboard">Home</a></li>
              <li class="breadcrumb-item active">Meeting Details</li>
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
		        <div class="col-12">
		          
		          <div class="card">
		            <!-- <div class="card-header">
		              <h3 class="card-title"></h3>
		            </div> -->
		            <!-- /.card-header --> 
		            <div class="card-body">
		              <table id="example1" class="table table-bordered table-striped">
		                <thead>
		                <tr>
		                  <th>Id</th>
		                  <th>Title</th>                  
		                  <th>Department</th>		                 
		                  <th>Date</th>
		                  <th>Status</th>
						  <th>Edit</th>
						  <th>Delete</th>
		                </tr>
		                </thead>
		                <tbody id="employee-table">
		                      
		                </tbody>
		                <tfoot>
		                <tr>
		                  <th>Id</th>
		                  <th>Title</th>                  
		                  <th>Department</th>		                  
		                  <th>Date</th>
		                  <th>Status</th>
						  <th>Edit</th>
						  <th>Delete</th>
		                </tr>
		                </tfoot>
		              </table>
		            </div>
		            <!-- /.card-body -->
		          </div>
		          <!-- /.card -->
		        </div>
		        <!-- /.col -->
		      </div>
      </div>
      <!-- /.row -->
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


<script src="/plugins/datatables/jquery.dataTables.js"></script>
<script src="/plugins/datatables-bs4/js/dataTables.bootstrap4.js"></script>


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



$(function () {
    $("#example1").DataTable();
    $('#example2').DataTable({
      "paging": true,
      "lengthChange": false,
      "searching": false,
      "ordering": true,
      "info": true,
      "autoWidth": false,
    });
  });


$(document).ready(function(){
	
	//alert("ddd");
    var t = $('#example1').DataTable();
     //alert("dd");

	  $.ajax({
	      type: "GET",
	      contentType : 'application/json; charset=utf-8',
	      dataType : 'json',
	      url: "/meeting/all",
	      //data: JSON.stringify(employee),
	      success :function(result) {
	            console.log(result);
	    	  $.each(result,function( i,j ) {
	    		  
	    		  t.row.add( [
	    			  j.id,j.title,j.dep_name,j.date_of_event,
	    			  '<button onClick="meetingStatus('+j.dep_id+')")>view</button>',
	    			  '<i class="fas fa-pie-chart" style="cursor:pointer;">',
	    			  '<i class="fas fa-edit" style="cursor:pointer;"></i>'
	    			  
	    			  
	    		  ]).draw( false );
	    	  });
	     },
       error: function(e){          	   
    	  console.log(e)
    	   
    	  }
	  });
	
	
});



function meetingStatus(id){	
	sessionStorage.setItem("meetingId", id);
	window.location.href = '/meetingStatus';
}




</script>
</body>
</html>
