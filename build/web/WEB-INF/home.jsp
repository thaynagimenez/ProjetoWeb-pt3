<%-- 
    Document   : home
    Created on : 13/10/2016, 21:47:24
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Startup Weekend</title>
    </head>

    <body>
        
        <%-- Cabeçallho --%>
        <jsp:include page="/WEB-INF/_header.jsp"></jsp:include>
        </body>
        
        
        <!--Seção 1 - Learn, Network, Startup-->
        <section class="sw-hero sw-hero-home inverter-cor">
            <div class="container">
                <div class="col-lg-10 col-lg-offset-1 col-md-12">
                    <h1>Learn, Network, Startup</h1>
                    <p>In just 54 hours, you will experience the highs, lows, fun, and pressure that make up life at a startup. As you learn how to create a real company, you'll meet the very best mentors, investors, cofounders, and sponsors who are ready to help you get started. Your community is here to help you — find an event today!</p>

                    <div class="container hero-search hidden-xs hidden-sm">
                        <div class="row">
                            <div class="col-md-5"><h3>Find an event near:</h3></div>
                            <div class="col-md-7">
                                <form class="form-inline event-search">
                                    <div style="margin:0; padding:0; display:inline">
                                        <input name="utf8" type="hidden"/>
                                    </div>
                                    <div class="form-group">
                                        <input class="form-control" id="event" name="event" placeholder="Find" size="50" type="text" />
                                        <button class="btn btn-white btn-search" name="button" type="submit">Go!</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>

        <!--Seção 2 - Introdução -->
        <section class="sw-introduction">
            <div class="container">
                <h2>The hardest part of starting up is starting out. At Startup Weekend, you'll be immersed in the ideal environment for startup magic to happen.</h2>
                <p class="pxl">Surrounded by smart, passionate people and with the best tools and approaches at your disposal, you’ll take giant leaps toward creating a business, becoming a founder, and connecting with the right people and resources.</p>

                <div class="row sw-offset-row">
                    <div class="col-md-3 col-sm-6">
                        <div class="sw-content-block sw-block-connect">
                            <div class="sw-block-icon"><img src=""/></div>
                            <h3>Connect</h3>
                            <p>Connect with people driven to build something new. Rich and diverse talent is a Startup Weekend staple.</p>
                            <p>Are you ready to meet your next (cofounder) (friend) (mentor) (investor)?</p>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="sw-content-block sw-block-discover">
                            <div class="sw-block-icon"><img src=""/></div>
                            <h3>Discover</h3>
                            <p>Discover where you are on the Entrepreneur's Journey.</p>
                            <p>Find the resources available near you.</p>
                            <p>Leave knowing the next steps you need to take on your road to success.</p>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="sw-content-block sw-block-learn">
                            <div class="sw-block-icon"><img src=""/></div>
                            <h3>Learn</h3>
                            <p>Learn what it really takes to start a company.</p>
                            <p>No book, panel, speaker, or blog post will teach you what you need to know.</p>
                            <p>The only way to learn is the experience of trying.</p>
                        </div>
                    </div>
                    <div class="col-md-3 col-sm-6">
                        <div class="sw-content-block sw-block-start">
                            <div class="sw-block-icon"><img src=""/></div>
                            <h3>Start</h3>
                            <p>It’s that simple. Startup Weekend is designed to get you going, FAST.</p>
                            <p>Your local Organizers will set up the ideal environment for you to be successful and learn as much as possible in just 54 hours.</p>
                        </div>
                    </div>
                </div>
            </div>
        </section>


        
    <%-- Rodapé --%>
    <jsp:include page="/WEB-INF/_footer.jsp"></jsp:include>

</body>
</html>
