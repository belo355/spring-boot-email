# Mail sender

MS is a java application for sending to a configured mailbox

## Confg

Use the application.properties configure the destination email

```bash

email.sender.to=you-mail@***.com
email.sender.host=smtp.gmail.com
email.sender.port=587
email.sender.username=your-mail@***.com
email.sender.password=your-pass
email.transport.protocol=smtp
email.smtp.auth=true
email.smtp.starttls.enable=true
email.debug=false
email.from.address=you-mail@***.com

```
