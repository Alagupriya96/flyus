Feature: Feature containing Search  functionality

 
  Scenario Outline: Search into Flyus
    Given User enters "<source>", "<destiation>"
    When user select the flight and click search
    When Users entersbelow passenger info
      | FirstName   | LastName   |
      | <firstName> | <lastName> |
    Then Search should be sucessfull.

    Examples: 
      | source                                            | destiation                                | firstName  | lastName |
      | New York City, United States - All Airports (NYC) | Los Angeles, United States - LAX (LAX)    | Alagupriya | M        |
      | Chennai, India - Chennai (MAA)                    | Dubai, United Arab Emirates - Dubai (DXB) | priya      | M        |
