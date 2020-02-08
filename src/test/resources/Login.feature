Feature: Check Login page

  Scenario Outline: Login Scenario
    Given username logs in
    Then redirect to home page <pagenr>

    Examples:
      | pagenr  |
      | 100     |
      | 200     |
