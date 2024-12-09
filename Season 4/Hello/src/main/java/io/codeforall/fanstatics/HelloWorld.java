package io.codeforall.fanstatics;

public class HelloWorld {

    @RequestMapping(method = RequestMethod.GET, value = "api/hello")
    public ResponseEntity<String>
    helloWorld(@RequestParam(value = "name", defaultValue = "World") String str) {

        return new ResponseEntity<String>("Hello " + str, HttpStatus.I_AM_A_TEAPOT);

    }
}
