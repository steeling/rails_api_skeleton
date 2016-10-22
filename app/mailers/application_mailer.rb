# Single point of entry for customization to base ActionMailer classes
class ApplicationMailer < ActionMailer::Base
  default from: 'from@example.com'
  layout 'mailer'
end
