require 'gcloud/datastore'

# Single point of entry for customization to base ActiveRecord classes
class ApplicationRecord
  self.abstract_class = true

  # def self.from_entity entity
  #   object = self.Class.new
  #   object.id = entity.key.id
  #   entity.properties.to_hash.each do |name, value|
  #     object.send "#{name}=", value if object.respond_to? "#{name}="
  #   end
  #   object
  # end
end
