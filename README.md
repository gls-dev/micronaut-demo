## Feature http-client documentation

- [Micronaut Micronaut HTTP Client documentation](https://docs.micronaut.io/latest/guide/index.html#httpClient)

Sample application to highlight the issue initialising eager singletons.  
1. `Application.kt` fails to start if setting `eagerInitSingletons()` to true
2. `SampleRequestHandlerTest` fails for similar reasons and overriding `newApplicationContextBuilder()` does not affect the outcome of the test  

