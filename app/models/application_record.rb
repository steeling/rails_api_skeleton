# Single point of entry for customization to base ActiveRecord classes
class ApplicationRecord < ActiveRecord::Base
  self.abstract_class = true
end
