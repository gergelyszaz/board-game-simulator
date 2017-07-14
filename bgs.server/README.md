# Summary
Server application capable of running board games.
To communicate with it, send json messages through WebSocket protocol.

# Messages 
## Get games available on the server
Send:
```json
{
  "action" : "list",
  "param" : "games"
}
```
Response:
```json
TBW
```
## Join a game
Send:
```json
{
  "action" : "join",
  "param" : "<ID of the game>"
}
```
Response:
```json
TBW
```
## Make a move
Send:
```json
{
  "action" : "select",
  "param" : "<ID of the selected element>"
}
```
Response:
```json
TBW
```
## Updating
The server automatically sends updates about the state of the game
Response:
```json
TBW
```
