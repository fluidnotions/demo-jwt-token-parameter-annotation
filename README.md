# Spring Boot JWT Token Decoder Library Demo

## Overview

Use the following request after running the application to see the decoded JWT token JSON in the console logs.

```shell
curl --request GET \
  --url http://localhost:8080/hello \
  --header 'Authorization: Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c' 
```

The decoded JWT token JSON will be printed in the console logs.
eg: 
```txt 
demo : claims: MyClaims[sub=1234567890, name=John Doe, iat=1516239022]
```