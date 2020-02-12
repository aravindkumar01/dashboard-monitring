<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <jsp:include page="menu.jsp" />
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
                    <label>Degree</label>
                    <input type="text" class="form-control" placeholder="Enter degree" id="degree">
                  </div>
                   <div class="form-group">
                    <label>Email</label>
                    <input type="email" class="form-control" placeholder="Enter email" id="email">
                  </div>
                  <div class="form-group">
                    <label>Email</label>
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
	
	
	
	
});


function myFunction(){
	var employee={"first_name":$("#firstname").val(),"last_name":$("lastname").val(),
			"email":$("#email").val(),"degree":$("#degree").val(),"gender":$("#gender").val(),
			"dob":$("#dob").val(),"address":$("address").val(),"pincode":$("#pincode").val(),
			"city":$("#city").val(),"district":$("#district").val(),"state":$("state").val()};
	
	
	  $.ajax({
	      type: "POST",
	      contentType : 'application/json; charset=utf-8',
	      dataType : 'json',
	      url: "/employee/add",
	      data: JSON.stringify(employee),
	      success :function(result) {
	        alert(result);
	     },
         error: function(e){          	   
      	  console.log(e)
      	   
      	   	        }
	  });
}


</script>
</body>
</html>
