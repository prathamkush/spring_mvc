1. Starting from Client goes to -> [http://localhost:8080/springmvc/searchPlayerForm](http://localhost:8080/springmvc/searchPlayerForm)
2. backend :    {   => web.xml -> servlet class -> dispatcher 
                    => contextConfigLocation -> goes to -> player-servlet.xml,
                          also sets the servlet dispatcher mapping to /springmvc/*
                          (here, dispatcher is player-servlet.xml) } 
                    => player-servlet -> { scans components from the base package (using spring annotations), and Search for
                       for @controller
                    => @controller mapping to /searchPlayerForm. 
                    => from there returns to the 'search-player-form'
                    => returns to player-servlet and checks for .jsp view named('search-player-controller') through InternalResourceViewResolver via given path
                       prefix and suffix 
                    => from here web.xml dispatches to the mapping [/springmvc/searchPlayerForm]()
}
3. Frontend : The client fills the details of form with attribute 'playerName', now the 
              form action goes to 'showPlayerDetails'. with request -> [http://localhost:8080/springmvc/showPlayerDetails?playerName=alice](http://localhost:8080/springmvc/showPlayerDetails?playerName=alice)
4. backend :  Goes again to web.xml -> dispatches to -> player-servlet, search for the component @Controller
              -> goes to @controller mapping 'showPlayerDetails' -> gets the above request body and fetches the 'playerName' attribute 
              -> adds this fetched attribute to our Model in a field "name" -> @Controller returns to 'show-player-details'
              -> returns to player-servlet and check for .jsp view named('show-player-details') through InternalResourceViewResolver via given path
                 prefix and suffix -> After binding the data field named "name" in html file 'show-player-binding', 
                 web.xml then dispatches it to the mapping [/springmvc/showPlayerDetails]() 
5. Frontend : After web.xml dispatches it, the Client sees the response with Player Details