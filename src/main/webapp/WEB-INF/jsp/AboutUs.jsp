<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>INIT</title>

    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">

    <!-- Animation CSS -->
    <link href="${pageContext.request.contextPath}/css/animate.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/font-awesome/css/font-awesome.min.css" rel="stylesheet">
	
    <link href="${pageContext.request.contextPath}/css/style.css" rel="stylesheet">
	<style>
	body{
    background: #eee;
}
span{
    font-size:15px;
}
a{
  text-decoration:none; 
  color: #0062cc;
  border-bottom:2px solid #0062cc;
}
.box{
    padding:60px 0px;
}

.box-part{
    background:#FFF;
    border-radius:0;
    padding:60px 10px;
    margin:30px 0px;
}
.text{
    margin:20px 0px;
}

.fa{
     color:#4183D7;
}
</style>
</head>
<body id="page-top" class="landing-page no-skin-config">
<div class="navbar-wrapper">
        <nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="background-color: black; style="color:white;"">
            <div class="container">
                <div class="navbar-header page-scroll">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/home"  style="font-family:Bahamas;color:#EC1D69;font-size:35px">Init Systems</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse">
                   <ul class="nav navbar-nav navbar-right">
                        <li><a class="page-scroll" href="/home" class="#page-top">Home</a></li>
                        <li><a class="page-scroll" href="/about" style="color:white;">About Us</a></li>
                        <li><a class="page-scroll" href="/bookcall">Book Call</a></li>
                        <li><a class="page-scroll" href="/contact" " >Contact</a></li>
                       </ul>
                 </div>
            </div> 
        </nav>
</div>


<section class=" services">
	<div class="box">
    <div class="container">
     	<div class="row">
			 <h1 class="text-center" style="font-size:40px;"><strong><u>About Us</u></strong></h1><br><br>
			    <div class="col-lg-12 col-md-4 col-sm-4 col-xs-12">
               
					<div class="">
                          
						<div class="text">
						<p style="line-height: 28px;text-align:justify;">  <strong style="font-size:15px;color:black;">Init Systems,</strong>
						  <span style="color:#005aff;"> a 25 Years Old Proprietorship Company having Head Office at Coimbatore
							and Branch at Salem, catering business operations throughout Tamil Nadu, Parts of
							Karnataka &amp; Kerala.</span>
									</p>
						<p style="line-height: 28px;text-align:justify;">   <span style="color:#005aff;">Our Primary focus is into<strong style="font-size:15px;color:black;"> IT Hardware  Setup
						</strong> We are Authorized Partners for Leading
						Brands like Intel, Apple, HP, Lenovo, Dell, Microsoft, Linux, Panasonic, Samsung, LG, Acer
						on Servers / Desktops / Laptop / Smart TVs / Tablets &amp; Phones, also handles all Prominent
						Brands Printers, Scanners &amp; Accessories at Spare Level.</span>
									</p>
						
						
						<p style="line-height: 28px;text-align:justify;">   <span style="color:#005aff;">We elevated ourselves towards <strong style="font-size:15px;color:black;">IT Enterprise Solutions Team</strong> which deliver End to End
								support to Data-Centre Solutions, Cloud Platforms, Campus Networking &amp; Wi-Fi Solutions,
								P2P Connectivity, EPABX / IPABX, CCTV &amp; Data-Wall Solutions, Firewalls, Classroom Touch
								Screens / Interactive Boards with Projectors, Rental Desktops / Laptops, Walki-Talkie,
								Backup Solutions, Attendance Systems, Vehicle Tracking Solutions, Software Support, Fire &amp;
								Safety, Burglary, Audio Solutions, Anti-Theft System, Home Automation Solutions, Metal
								Detectors, Barcode Printer &amp; Scanners, Point Of Sale, Public Announcement Systems, Mobile
								Jammers, Electrical, &amp; UPS Setup. We had aligned with most of the Major Leading Brands in
								market to address the needs of our clients and to deliver customized solutions after
								analyzing client’s requirement.</span>
						
						
									</p>
						
						<p style="line-height: 28px;text-align:justify;">   <span style="color:#005aff;">At Service we offer 24x7 support and under takes Annual Maintenance {AMC} / Annual
									Service Contract {ASC} / Chip Level Service Support for your Existing IT Infrastructure as
									well as offers support to your New IT Procurements too. We also provides on-site residential
									engineers and also Per-call Base engineer on need basis.
									Embedded Technology is also a part of our business were we customize IOT enabled
									gadgets as per customers requirement, design, develop and deliver products on demand
									basis with innovative capabilities.</span>
									</p>
				
				
						</div>
                        
						
                        
					 </div>
				</div>	 
				

				
				 
		</div>		
    </div>
</div>
</section>

<br><br>



<!-- Mainly scripts -->
<script src="${pageContext.request.contextPath}/js/jquery-3.1.1.min.js"></script>
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/metisMenu/jquery.metisMenu.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/slimscroll/jquery.slimscroll.min.js"></script>

<!-- Custom and plugin javascript -->
<script src="${pageContext.request.contextPath}/js/inspinia.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/pace/pace.min.js"></script>
<script src="${pageContext.request.contextPath}/js/plugins/wow/wow.min.js"></script>


<script>

    $(document).ready(function () {

        $('body').scrollspy({
            target: '.navbar-fixed-top',
            offset: 80
        });

        // Page scrolling feature
        $('a.page-scroll').bind('click', function(event) {
            var link = $(this);
            $('html, body').stop().animate({
                scrollTop: $(link.attr('href')).offset().top - 50
            }, 500);
            event.preventDefault();
            $("#navbar").collapse('hide');
        });
    });

    var cbpAnimatedHeader = (function() {
        var docElem = document.documentElement,
                header = document.querySelector( '.navbar-default' ),
                didScroll = false,
                changeHeaderOn = 200;
        function init() {
            window.addEventListener( 'scroll', function( event ) {
                if( !didScroll ) {
                    didScroll = true;
                    setTimeout( scrollPage, 250 );
                }
            }, false );
        }
        function scrollPage() {
            var sy = scrollY();
            if ( sy >= changeHeaderOn ) {
                $(header).addClass('navbar-scroll')
            }
            else {
                $(header).removeClass('navbar-scroll')
            }
            didScroll = false;
        }
        function scrollY() {
            return window.pageYOffset || docElem.scrollTop;
        }
        init();

    })();

    // Activate WOW.js plugin for animation on scrol
    new WOW().init();

</script>

</body>
</html>
