
# Model Generator

This is a code generation application for creating java classes that assist in consuming JSON from APIs. Currently, it only supports SportRadar, but will be enhanced to allow other providers as well as manual generation. Models for the request are generated as well as a simple client layer.


## Usage/Examples

To use this, pull the repo and run using your favorite editor. This will trigger a command-line prompt, asking for which SportRadar API you want to consume. You can paste in any SportRadar url you'd like, or if you want one of the pre-loaded ones that are listed, you can just enter the name of it. For example, entering 'nfl v7' is equivalent to 'https://developer.sportradar.com/docs/read/american_football/NFL_v7' here:

```
The following documentation URLs are here for your convenience:
NHL V7=https://developer.sportradar.com/docs/read/hockey/NHL_v7
NBA V7=https://developer.sportradar.com/docs/read/basketball/NBA_v7
NBA V8=https://developer.sportradar.com/docs/read/basketball/NBA_v8
Golf V3=https://developer.sportradar.com/docs/read/golf/Golf_v3
NFL V7=https://developer.sportradar.com/docs/read/american_football/NFL_v7
MLB V7=https://developer.sportradar.com/docs/read/baseball/MLB_v7]
Enter SportRadar docs url or one of the keys (keys are not case-sensitive) for one mentioned above: nfl v7
```

The application will then access that documentation (possibly automatically opening Safari), and scrape the name and urls for each request on the page. From there it will go through each request and execute it to gather a JSON response that it can use for the generation. The next prompt you receive will ask for the name of the folder to generate. This will dictate the package name that the generated code will belong to, as well as result in all DTOs being prefixed with that name. For example:

```
Enter a name for the folder to generate: sr nfl v7
```
Will result in a package being created called `srnflv7`, and each model class to be appended with `SrNflV7...`.
Finally, in the `temp` folder at the project root, you will find the generated code. Each request's models are packaged in a separate folder and the client interface and implementation will be at the root of the package.
## Support

For issues or feature requests, please add them to this repos issues panel https://github.com/joshPostFD/model-generator/issues.
For support, email joshua.post@fanduel.com or message me on Slack.

